class Stars{
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String res = "";
        int tempCount = count;
        int x = 0;
        int[]arrStars = {1000, 100, 10, 1};
        char[]arrSymbols = {'X','Y','Z','*'};
        for(int i=0; i<4; i++){
            x = tempCount / arrStars[i];
            tempCount %= arrStars[i];
            for(int j =0; j<x; j++) res+=arrSymbols[i];
        }return res;
    }

   public static void main(String[]args){
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}

