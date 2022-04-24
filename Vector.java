// dynamic array
class Vector{
    int size;
    int capacity;
    int[] arr;

    public Vector(int capacity){
        this.size=0;
        this.capacity=capacity;
        this.arr=new int[capacity];
    }
    public int size(){
        return this.size;
    }
    public int capacity(){
        return this.capacity;
    }
    public int get(int i){
        return arr[i];
    }
    public void set(int i, int val){
        arr[i]=val;
    }
    public void add(int val){
        if (this.size==this.capacity){
            int[] newArr = new int[size*2];
            for (int i=0;i<this.size;i++){
                newArr[i]=arr[i];
            }
            arr = newArr;
            capacity*=2;
        }
        arr[size]=val;
        this.size++;
    }
    public void remove(int i){
        for (int j=i;j<this.size-1;j++){
            arr[j]=arr[j+1];
        }
        arr[this.size-1]=0;
        this.size--;
    }
    public static void main(String[] args) {
        Vector dynArr = new Vector(2);
        dynArr.add(4);
        dynArr.add(5);
        dynArr.remove(1);
        dynArr.add(6);
        System.out.println(dynArr.size());
        for (int i=0;i<dynArr.size();i++){
            System.out.println(dynArr.get(i)+" ");
        }
    }
}