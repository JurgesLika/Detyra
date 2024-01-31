public class Car {
    private String carMaker;
    private String type;
    public Car(String carMaker,String type){
        this.carMaker=carMaker;
        this.type=type;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public String getType() {
        return type;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    public void setType(String type) {
        this.type = type;
    }

    public class Engine{
        String engineType;
        public void setEngineType(){

            if("economy".equalsIgnoreCase(type)){
                engineType="diesel";
            } else if ("luxury".equalsIgnoreCase(type)) {
                engineType="electric";
            }else {
                engineType="petrol";
            }
        }
    }

}
