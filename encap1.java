public class encap1 {
    class human{
        private int height;
        private int weight;
        private String gender;
        int x;
        public int getHeight(){
            return height;
        }
        public int getWeight(){
            return weight;
        }
        public String getGender(){
            return gender;
        }
        public void setHeight(int Nheight){
            this.height=Nheight;
        }
        public void setWeight(int newWeight){
            this.weight=newWeight;
        }
        public void setGender(String newGender){
            this.gender=newGender;
        }
    }
    public static void main(String [] args){
        human mySpecify=new human();
        mySpecify.setHeight(94);
        mySpecify.setGender("Male");
        mySpecify.setWeight(73);
        System.out.println("the gender of human is:"+mySpecify.getGender());


    }
}
