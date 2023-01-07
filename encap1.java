public class encap1 {
    class human{
        private int height;
        private int weight;
        private String gender;
        public int getNameH(){
            return height;
        }
        public int getNameW(){
            return weight;
        }
        public String getNameG(){
            return gender;
        }
        public void setNameH(int Nheight){
            this.height=Nheight;
        }
        public void setNameW(int newWeight){
            this.weight=newWeight;
        }
        public void setNameG(String newGender){
            this.gender=newGender;
        }
    }
    public static void main(String [] args){
        human mySpecify=new human();
        mySpecify.setNameH(94);
        mySpecify.setNameG("Male");
        mySpecify.setNameW(73);
        System.out.println("the gender of human is:"+mySpecify.getNameG());


    }
}
