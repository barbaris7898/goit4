public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if(bigRocketCount<0 && bigRocketCount>100){
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if(smallRocketCount<0 && smallRocketCount>100){
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }

    public void launchBigRocket(){
        if(this.bigRocketCount>0){
            bigRocketCount --;
        }System.out.println("Launch " +bigRocketCount+ " rocket");
    }
    public void launchSmallRocket(){
        if(this.smallRocketCount>0){
            smallRocketCount --;
        }System.out.println("Launch "+ smallRocketCount + " rocket");
    }
    public int getTotalPower(){
        return this.bigRocketCount*100 + this.smallRocketCount*50;
    }
    public static void main(String[] args){
        SpaceRocketLauncher launcher = new SpaceRocketLauncher();
        launcher.setBigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("Power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

        launcher.launchSmallRocket();
        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

        System.out.println("Power is " + launcher.getTotalPower());
    }
}
