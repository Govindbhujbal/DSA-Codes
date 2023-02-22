package learningJava;
import java.util.*;

class TravelAgencies{
	int regNo;
	String agencyName;
	String packageType;
	int price;
	boolean flightFacility;
	
	TravelAgencies(int regNo,String agencyName,String packageType,int price,boolean flightFacility){
		this.regNo=regNo;
		this.agencyName=agencyName;
		this.packageType=packageType;
		this.price=price;
		this.flightFacility=flightFacility;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFlightFacility() {
		return flightFacility;
	}
	public void setFlightFacility(boolean flightFacility) {
		this.flightFacility = flightFacility;
	}
}


public class SolutionForNitin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int regNo;
		String agencyName;
		String packageType;
		int price;
		boolean flightFacility;
		TravelAgencies[] arr = new TravelAgencies[4];
		for(int i=0;i<4;i++) {
			regNo=sc.nextInt();
			sc.nextLine();
			agencyName=sc.nextLine();
			packageType=sc.nextLine();
			price=sc.nextInt();
			flightFacility=sc.nextBoolean();
			arr[i] = new TravelAgencies(regNo,agencyName,packageType,price,flightFacility);
		}
		int searchRegNo=sc.nextInt();
		sc.nextLine();
		String searchPackageType=sc.nextLine();
		int ans = findAgencyWithHighestPackagePrice(arr);
		System.out.println(ans);
		TravelAgencies obj = agencyDetailsForGivenldAndType(arr,searchRegNo,searchPackageType);
		System.out.println(obj.agencyName+":"+obj.price);
	}
	 static int findAgencyWithHighestPackagePrice( TravelAgencies arr[] ) {
		 int ans = -1;
		 int length = arr.length;
		 for(int i=0;i<length;i++) {
			 if(arr[i].price>ans) {
				 ans=arr[i].price;
			 }
		 }
		return ans;
	}
	 static TravelAgencies agencyDetailsForGivenldAndType( TravelAgencies arr[], int searchRegNo, String searchPackageType){
		 int length = arr.length;
		 TravelAgencies ans = null;
		 for(int i=0;i<length;i++) {
			 TravelAgencies obj = arr[i];
			 if(obj.flightFacility==true) {
				 if(obj.regNo==searchRegNo && obj.packageType.equals(searchPackageType)) {
					 ans = obj;
				 }
			 }
		 }
		 return ans;
	 }
	
}
