import java.util.*;

public class Dynamicarray {
        //java = arraylist
        //c++ = vector
        //javascript = array
        //python = list

        int size;
        int capacity = 10;
        Object[] array;

        public Dynamicarray() {
            this.array = new Object[capacity];
        }

        public Dynamicarray(int capacity) {
            this.capacity = capacity;
            this.array = new Object[capacity];
        }

        public void add(Object data){
            while (size < capacity && array[size] != null) {
                size++;
            }
            if(size >= capacity){
                grow();
            }
            array[size] = data;
            size++;
            
        }

        public void insert(int index, Object data){
            if(size >= capacity){
                grow();
            }
            for(int i=size;i>index; i--){
                array[i] = array[i-1];
            }
            array[index] = data;
            size++;
        }

        public void deete(Object data){
            for(int i = 0 ; i<size; i++){
                if(array[i] == data){
                    for(int j=0;j<size-i-1;j++){
                        array[i+j] = array[i+j+1];
                    }
                    array[size-1] = null;
                    size--;
                    if(size<=(capacity/3)){
                        shrink();
                    }
                    break;
                }
            }
        }

        public int search(Object data){
            for(int i = 0 ;i<size;i++){
                if(array[i]==data){
                    return i;
                }
            }

            return -1;
        }

        private void grow(){
            int newcapacity = capacity*2;
            Object[] newarray = new Object[newcapacity];
            for(int i  =0;i<size;i++){
                newarray[i]=array[i];
            }
            capacity = newcapacity;
            array = newarray; 

        }

        private void shrink(){
            int newcapacity = capacity/2;
            Object[] newarray = new Object[newcapacity];
            for(int i  =0;i<size;i++){
                newarray[i]=array[i];
            }
            capacity = newcapacity;
            array = newarray; 
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public String toString(){
            String string = "";
            for(int i=0;i<capacity;i++){
                string += array[i] + ", ";
            }
            return string;
        }


        public static void main(String[] args) {
            Dynamicarray dynamicarray = new Dynamicarray(5);
            dynamicarray.array[0] =  "chinmay";
            dynamicarray.array[2]= "pavan";
            dynamicarray.add(10);
            dynamicarray.add("parth");
            dynamicarray.insert(1, "himanshu");
            dynamicarray.deete(10);
            System.out.println(dynamicarray.search("chinmay")
            );
            dynamicarray.add(10);
            dynamicarray.add(20);
            dynamicarray.deete(10);
            dynamicarray.deete(20);
            dynamicarray.deete("chinmay");

            //output
            System.out.println(dynamicarray.capacity);
            System.out.println(Arrays.toString(dynamicarray.array));
            System.out.println(dynamicarray.isEmpty());
        }
}
