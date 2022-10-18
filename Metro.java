package com.xworkz.bigfish.boot;

public class Metro {
	public String name;
	public String Source;
	public String destination;
	public int price;
	public boolean running;
	
	public String[] colors;
	public String[] compartmentsName;
    public String[] stationName;
    public String[] stationManagerName;
    public long[] stationManagerNumber;
    public int[] distance;
    
    public Metro(String name,String Source,int[] distance,int price,boolean running,String[]stationName,String[]stationManagernName,long[]stationManagerNumber, String destination, String[] colors, String[] compartmentsName, String[] stationManagerName)
    {
    	this.name=name;
    	this.Source=Source;
    	this.destination=destination;
    	this.price=price;
    	this.running=running;
    	this.colors=colors;
    	this.compartmentsName=compartmentsName;
    	this.distance=distance;
    	this.stationManagerName=stationManagerName;
    	this.stationManagerNumber=stationManagerNumber;
    	this.stationName=stationName;
    }
    public Metro() {
		
	}
	public Metro(String string, String string2, String string3, int i, boolean b, String[] colors2,
			String[] compartmentNames, String[] stationName2, String[] stationManagerName2,
			int[] stationManagerNumber2) {
		// TODO Auto-generated constructor stub
	}
	public void display() 
    {
    	System.out.println("Name:"+this.name);
    	System.out.println(this.Source);
    	System.out.println(this.destination);
    	System.out.println(System.lineSeparator()+"colours:");
    	for (int i = 0; i < colors.length; i++) {
			System.out.println(this.colors[i]);
		}
    	
    	System.out.println(System.lineSeparator()+"compartmentsName:");
    	for (int i = 0; i < this.compartmentsName.length; i++)
    	{
    		System.out.println(this.compartmentsName[i]);
    	}
    		for (int i = 0; i < this.distance.length; i++)
    		{
				System.out.println(this.distance[i]);
				
			}
    		for (int i = 0; i < this.stationName.length; i++)
    		{
				System.out.println(this.stationName[i]);
				
			}
    		for (int i = 0; i < this.stationManagerName.length; i++)
    		{
				System.out.println(this.stationManagerName[i]);
				
			}
    		for (int i = 0; i < this.stationManagerNumber.length; i++)
    		{
				System.out.println(this.stationManagerNumber[i]);
				
			}
			
		}
    	
    }


