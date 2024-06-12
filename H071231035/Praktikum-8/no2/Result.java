package no2;

class Result {
    String name;
    double finishTime;
    
    public Result(String botName, double d) {
        this.name = botName;
        this.finishTime = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(double finishTime) {
        this.finishTime = finishTime;
    }


    
}
