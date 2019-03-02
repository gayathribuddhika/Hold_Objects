
package holdobjects;


public class DogList {
    private Dog[] thelist = new Dog[5];
    //private int i = 0;
    int i;
    public void add(Dog d){
        for(i=0;i<5;i++){
        if(i<thelist.length){
           thelist[i] = d;
            System.out.println("Dog added at index "+i);
        } 
        }
    }
}
