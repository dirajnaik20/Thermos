
public class Thermos {
	String Brand;
	String Liquid;
	double Volume;
	
	
	Thermos(String Brand,String Liquid,int Volume)
	{
		this.Brand=Brand;
		this.Liquid=Liquid;
		this.Volume=Volume;
	}
	
	double addLiquid(double vol)
	{
		Volume=Volume+vol;
		return Volume;
	}
	
	void display()
	{
		System.out.println("Brand: "+Brand);
		System.out.println("Liquid: "+Liquid);
		System.out.println("Volume: "+addLiquid(0.5)+" liters");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thermos u1=new Thermos("Godrej","Orange Juice",0);
		u1.display();

	}

}
