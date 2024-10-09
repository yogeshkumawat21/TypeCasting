class ImplicitTypeCasting
{
    //TypeCasting:converting One Data Type to Another
    //Types:1)Widening , Implicit , Downcasting : Converting smaller datatypes to bigger it does implicitly
    //Double<--Float<--long<--Int<--Short<--Byte
   public void implementingImplicitTypeCasting()
   {
       byte a =20;
       int b=a;
       long c = b;
       float d = c;
       double e =d;

       System.out.println("Value of byte before Conversion :"+a);
       System.out.println("Value of byte after Conversion to int :"+b);
       System.out.println("Value of int after Conversion to long :"+c);
       System.out.println("Value of long after Conversion to float :"+d);
       System.out.println("Value of float after Conversion to double :"+e);
   }

}

class ExplicitTypeCasting
{
    //Types:2)Widening , Explicit , Upcasting : Converting bigger datatypes to smaller we have to do explicitly
    //Double-->Float-->long-->Int-->Short-->Byte

    //WideningTypeCasting types : 1)Explicit Upcasting:2)Explicit Downcasting


    public void implementingExplicitTypeCasting()
    {
        double   a =20;
        float  b=(float) a;
        long c = (long)b;
        int d =(int) c;
        byte e =(byte)d;

        System.out.println("Value of double before Conversion :"+a);
        System.out.println("Value of double after Conversion to float :"+b);
        System.out.println("Value of float after Conversion to long :"+c);
        System.out.println("Value of long after Conversion to int :"+d);
        System.out.println("Value of int after Conversion to byte :"+e);
    }

}

//Explicit UpandDowncasting in Tree
class Animal
{
    void sound()
    {
        System.out.println("Animal Sound Checked");
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dogs sound Bark");
    }
    void color()
    {

        System.out.println("color is black");
    }
}




public class Main {
    public static void main(String[] args)
    {
        //ImplicitTypeCasting Class
        //ImplicitTypeCasting implicitTypeCasting = new ImplicitTypeCasting();
       // implicitTypeCasting.implementingImplicitTypeCasting();

        //ExplicitTypecasting Class
       // ExplicitTypeCasting explicitTypeCasting = new ExplicitTypeCasting();
        //explicitTypeCasting.implementingExplicitTypeCasting();


        //Explicit UpandDowncasting in Tree
        //Animal animal = new Dog();
        //animal.sound();
      //  animal.color(); it will give error as animal method is not described in it

        //Dog dog = (Dog) animal;
        //dog.color();
    }
}