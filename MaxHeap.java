package Sorting;

public class MaxHeap {
    int[] heap;
    int size;
    int maxSize;

    MaxHeap(int maxSize){
        heap = new int[maxSize+1];
        heap[0] = Integer.MAX_VALUE;
        size=0;
    }
    public void swap(int first, int second){
        int temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }
    public int parent(int index){
        return index/2;
    }
    public int left(int index){
        return index*2;
    }
    public int right(int index){
        return index*2+1;
    }
    public void insert(int key){
            heap[++size] = key;
            int current = size;
            while (heap[current]>heap[parent(current)]){
                swap(current,parent(current));
                current = parent(current);
        }
    }

    public boolean isLeaf(int index){
        if(index>=size/2 && index<size){
            return true;
        }else {
            return false;
        }
    }

    public void heapify(int index){
        if(isLeaf(index)){
            return;
        }
        if (heap[left(index)]>heap[index] || heap[right(index)]>heap[index]){
            if(heap[left(index)]>heap[right(index)]){
                swap(index,left(index));
                heapify(left(index));
            }else {
                swap(index,right(index));
                heapify(right(index));
            }
        }
    }

    public void extract(){
        int extracted =heap[1];
        System.out.println("Extracted Element: "+extracted);
        heap[1] = heap[size--];
        heapify(1);
    }
    public void print(){
        for (int i=1;i<=size/2;i++){
            System.out.println("Parent: "+heap[i]+" Left Chid: "+heap[2*i]+" Right Child: "+heap[2*i+1]);
        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(7);
        maxHeap.insert(50);
        maxHeap.insert(30);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(10);
        maxHeap.insert(60);
        maxHeap.print();
        System.out.println("=============================");
        maxHeap.extract();
        maxHeap.print();
    }
}
