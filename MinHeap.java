package Sorting;

public class MinHeap {
    int heap[];
    int size;
    int maxSize;

    MinHeap(int maxSize){
        size = 0;
        heap = new int[maxSize+1];
        heap[0] = Integer.MIN_VALUE;
    }
    public int parent(int index){
        return index/2;
    }
    public int left(int index){
        return 2*index;
    }
    public int right(int index){
        return 2*index+1;
    }
    public void swap(int first, int second){
        int temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    public void insert(int key){
        heap[++size]=key;
        int current = size;
        while (heap[current]<heap[parent(current)]){
            swap(parent(current),current);
            current=parent(current);
        }
    }

    public boolean isLeaf(int index){
        boolean flag = false;
        if(index>size/2 && index<=size){
            flag = true;
        }
        return flag;
    }

    public void heapify(int index){
        if(isLeaf(index)){
            return;
        }
        if (heap[index]>heap[left(index)] || heap[index]>heap[right(index)]){
            if(heap[left(index)]<heap[right(index)]){
                swap(left(index),index);
                heapify(left(index));
            }else {
                swap(right(index),index);
                heapify(right(index));
            }
        }
    }

    public void extract(){
        int extracted = heap[1];
        System.out.println("Extracted Element: "+extracted);
        heap[1] = heap[size--];
        heapify(1);
    }

    public void print(){
        for (int i=1;i<=size/2;i++){
            System.out.println("Parent: "+heap[i]+" Left Child: "+heap[2*i]+" Right Child: "+heap[2*i+1]);
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(7);
        minHeap.insert(50);
        minHeap.insert(30);
        minHeap.insert(20);
        minHeap.insert(15);
        minHeap.insert(10);
        minHeap.insert(60);
        minHeap.print();
        System.out.println("=============================");
        minHeap.extract();
        minHeap.print();
    }
}
