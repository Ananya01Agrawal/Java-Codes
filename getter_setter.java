class MyEmployee{
        private int id;//private keyword is used for making the variable private
        private String name;

        public String getName(){
            return name;
        }

        public void setName(String n){
            name=n;//don't return the value it is used to update the value
        }
        public void setId(int i){
            id=i;
        }
        public int getId(){
            return id;//et is used to return the value
        }
    }
    public class getter_setter {
    public static void main(String[] args) {
        MyEmployee ananya=new MyEmployee();
        //ananya.id=78;
        //ananya.name="Ananya Agrawal";-->throws an error due o the private access modifiers
        ananya.setName("Ananya Agrawal");
        System.out.println(ananya.getName());
        ananya.setId(56);
        System.out.println(ananya.getId());


    }
}
