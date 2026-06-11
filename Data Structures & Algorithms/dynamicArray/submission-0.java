class DynamicArray {
    private int[] data;
    private int size;

    public DynamicArray(int capacity) {
        data = new int[capacity];
        size =0;
    }

    public int get(int i) {
        return data[i];
    }

    public void set(int i, int n) {
        data[i] = n;
    }

    public void pushback(int n) {
        if(size==data.length){
            resize();
        }
        data[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return data[size];
    }

    private void resize() {
        int[] resizeData = new int[data.length * 2];
        for(int i = 0 ; i < data.length ; i++){ 
            resizeData[i] = data[i]; 
        }
        data = resizeData;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }
}
