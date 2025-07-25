class Arraycreate{
public static void main(String Args[]){
System.out.println("The array is used to store collection(or) group of similar datatype values or homogenous values");
int ex[]={10,20,30,40};
System.out.println();
//cretaing array
System.out.println("there are two ways to implents");
System.out.println("\n");
System.out.println("the Syntax of the two create the array example:\ndatatype arrayname[];\narrayname=new datatype[size of array];");
System.out.println("\n");
System.out.println("we can represent in one line:datatype arrayname[]=new datatype[size of array](or)int ex[]={10,20,30,40};");
System.out.println("\n");
System.out.println("we can access the data or insert the data or retrive the data using index");
System.out.println("\n");
System.out.println("we can print the array all elemnts using loop");
System.out.println("The Array elements are:");
for(int i=0;i<ex.length;i++){
System.out.print(ex[i]);
System.out.print(" ");
}
    }	
}