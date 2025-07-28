// . We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
// ---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
// ---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
// Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
// Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
// Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
// ‌c
class Vehicle{
    int mileage;
    double price;
    Vehicle(int mileage,double price){
        this.mileage=mileage;
        this.price=price;
    }

}

    class Car extends Vehicle{
        double ownershipcost;
        int warranty;
        int seatingcapacity;
        String fueltype;
        Car(int mileage,double price,double ownershipcost,int warranty,int seatingcapacity,String fueltype){
            super(mileage,price);
            this.ownershipcost=ownershipcost;
            this.warranty=warranty;
            this.seatingcapacity=seatingcapacity;
            this.fueltype=fueltype;

        }
    }
    class Audi extends Car{
        String Modeltype;

        Audi(int mileage,double price,double ownershipcost,int warranty,int seatingcapacity,String fueltype,String Modeltype){
            super(mileage,price,ownershipcost,warranty,seatingcapacity,fueltype);
            this.Modeltype=Modeltype;
        }
        void display(){
        
            System.out.println(mileage);
            System.out.println(price);
            System.out.println(ownershipcost);
            System.out.println(warranty);
            System.out.println(seatingcapacity);
            System.out.println(fueltype);
            System.out.println(Modeltype);

        }

    }

    class Ford extends Car{
        String Modeltype;

        Ford(int mileage,double price,double ownershipcost,int warranty,int seatingcapacity,String fueltype,String Modeltype){
            super(mileage,price,ownershipcost,warranty,seatingcapacity,fueltype);
            this.Modeltype=Modeltype;
        }
        void display(){
        
            System.out.println(mileage);
            System.out.println(price);
            System.out.println(ownershipcost);
            System.out.println(warranty);
            System.out.println(seatingcapacity);
            System.out.println(fueltype);
            System.out.println(Modeltype);

        }
    }
    class Bike extends Vehicle{
        int nocyclinders;
        int nogears;
        String  coolingtype;
        String  Wheeltype;
        int fueltanksize;
        Bike(int mileage,double price,int nocyclinders,
        int nogears,
        String  coolingtype,
        String  Wheeltype,
        int fueltanksize){
            super(mileage,price);
            this.nocyclinders=nocyclinders;
            this.nogears=nogears;
            this.coolingtype=coolingtype;
            this.Wheeltype=Wheeltype;
            this.fueltanksize=fueltanksize;
        }


    }
    class Bajaj extends Bike{
        String Maketype;
        Bajaj(int mileage,double price, int nocyclinders,int nogears,String  coolingtype,String  Wheeltype,
        int fueltanksize,String Maketype){
        super(mileage,price,nocyclinders,nogears,coolingtype,Wheeltype,fueltanksize);
        this.Maketype=Maketype;

        }
        void display(){
            System.out.println(Maketype);
            System.out.println(mileage);
            System.out.println(price);
            System.out.println(nocyclinders);
            System.out.println(nogears);
            System.out.println(coolingtype);
            System.out.println(Wheeltype);
            System.out.println(fueltanksize);

        }

    }
    class TVS extends Bike{
        String Maketype;
        TVS(int mileage,int price,int nocyclinders,int nogears,String  coolingtype,String  Wheeltype,
        int fueltanksize,String Maketype){
        super(mileage,price,nocyclinders,nogears,coolingtype,Wheeltype,fueltanksize);
        this.Maketype=Maketype;

        }
        void display(){
        
            System.out.println(mileage);
            System.out.println(price);
            System.out.println(nocyclinders);
            System.out.println(nogears);
            System.out.println(coolingtype);
            System.out.println(Wheeltype);
            System.out.println(fueltanksize);

        }
    }
    class Q1{
        public static void main(String[] args){
            Audi A4model= new Audi(14,700.0,200.0,5,6,"Petrol","A4");
            A4model.display();
        }
    }