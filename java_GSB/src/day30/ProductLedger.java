package day30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public class ProductLedger {
	private ArrayList<ItemInOut> dailyList = new ArrayList<ItemInOut>(); 
	private Date date;
	
	@Data
	class ItemInOut{
		private Product product;
		private int inNum;
		private int outNum;
		
		public ItemInOut(Product product, int inNum, int outNum){
			this.product = product;
			this.inNum = inNum;
			this.outNum = outNum;
		}
		public ItemInOut(Product product){
			this.product = product;
		}

		private ProductLedger getEnclosingInstance() {
			return ProductLedger.this;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			ItemInOut other = (ItemInOut) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
				return false;
			}
			if (product == null) {
				if (other.product != null) {
					return false;
				}
			} else if (!product.equals(other.product)) {
				return false;
			}
			return true;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((product == null) ? 0 : product.hashCode());
			return result;
		}
	}
	
	ProductLedger(Date date, ArrayList<ItemInOut> list){
		this.date = date;
		this.dailyList = list;
	}
	ProductLedger(Date date){
		this.date = date;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ProductLedger other = (ProductLedger) obj;
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}

	public int findProductInLedge(Product product) {
		List rstList = dailyList.stream().filter(p->p==new ItemInOut(product)).collect(Collectors.toList());
		
		if(rstList==null||rstList.size()==0) {
			return -1;
		}else {
			return dailyList.indexOf(rstList.get(0));
		}
	}
	
	public void addProductInLedge(Product product) {
		Scanner scan = new Scanner(System.in);
		System.out.print("?????? : +  ??? (????????? ??????)");
		int tmpIn = scan.nextInt();
		scan.nextLine();
		System.out.print("?????? : -  ??? (????????? ??????)");
		int tmpOut = scan.nextInt();
		scan.nextLine();
		
		ItemInOut tmpItemIO=new ItemInOut(product, tmpIn, tmpOut);
		dailyList.add(tmpItemIO);
	
	}
	public void editProductInLedge(Product product, int index) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("?????? : +  ??? (????????? ??????)");
		int tmpIn = scan.nextInt();
		scan.nextLine();
		System.out.print("?????? : -  ??? (????????? ??????)");
		int tmpOut = scan.nextInt();
		scan.nextLine();
		
		ItemInOut tmpItemIO=new ItemInOut(product, tmpIn, tmpOut);
		dailyList.set(index, tmpItemIO);
	
	}
	public void printCal() {
		dailyList.forEach(p->{
			long totalIncome = (long)p.getProduct().getOutPrice()*p.outNum; // ????????? ??? ?????????
			long totalOutcome = (long)p.getProduct().getInPrice()*p.inNum;  // ????????? ??? ?????????
			
			System.out.println(p.getProduct().getName()+ " ?????? : ??? ????????? : - "+totalOutcome + "???, ??? ????????? : + "+totalIncome+"???, ??? ?????? ?????? : "+(totalOutcome-totalIncome));
		});
		
	}
	public void printCalRst() {
		long sumTotalIncome = dailyList.stream().mapToLong(p->(long)p.getProduct().getOutPrice()*p.outNum).sum();
		long sumTotalOutcome = dailyList.stream().mapToLong(p->(long)p.getProduct().getInPrice()*p.inNum).sum();
		System.out.println("??? ????????? : " + sumTotalIncome + " , ??? ????????? : -" + sumTotalOutcome + ", ??? ?????? ?????? : " + (sumTotalIncome-sumTotalOutcome));
		
	}
	
	
	
	public long returnCalRst() {
		long sumTotalIncome = dailyList.stream().mapToLong(p->(long)p.getProduct().getOutPrice()*p.outNum).sum();
		long sumTotalOutcome = dailyList.stream().mapToLong(p->(long)p.getProduct().getInPrice()*p.inNum).sum();
		
		return sumTotalIncome-sumTotalOutcome;
	}
	
	
	
}
