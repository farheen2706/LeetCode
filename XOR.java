class XOR {
    public int xorOperation(int n, int start) {
        int nums[]= new int[n];
        int XOR1=0;
        for(int i=0;i<n;i++)
        {
            nums[i]= start+2*i;
        }
        for(int i=0;i<n;i++){
            XOR1^=nums[i];
        }
        return XOR1;
    }
}
