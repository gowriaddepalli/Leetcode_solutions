class PhoneDirectory {

    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    int[] phonedir = null;
    int maxNo = 0;
    public PhoneDirectory(int maxNumbers) {
        maxNo = maxNumbers;
        phonedir = new int[maxNumbers];
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        int i =0;
        while(i<maxNo && phonedir[i] == 1){
            i++;
        }
        if(i<maxNo){
            phonedir[i] = 1;
            return i;
        }
        return -1;
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        if(phonedir[number] == 1){
            return false;
        }
        return true;
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        phonedir[number] =0;
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */
