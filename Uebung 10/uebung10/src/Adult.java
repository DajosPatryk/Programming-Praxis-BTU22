public class Adult extends Sim{
    private String[] Traits = new String[2];
    private String Aspiration = "";
    private Object looks;

    private Integer currentAge = 0;
    private final Integer maxAge = 14;
    private Integer LifeSpan = 0;

    public String[] getTraits() {
        return Traits;
    }

    public void setTraits(String[] traits) {
        Traits = traits;
    }

    public String getAspiration() {
        return Aspiration;
    }

    public void setAspiration(String aspiration) {
        Aspiration = aspiration;
    }

    public Object getLooks() {
        return looks;
    }

    public void setLooks(Object looks) {
        this.looks = looks;
    }

    public Integer getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(Integer currentAge) {
        this.currentAge = currentAge;
    }

    public Integer getLifeSpan() {
        return LifeSpan;
    }

    public void setLifeSpan(Integer lifeSpan) {
        LifeSpan = lifeSpan;
    }

    public void Birthday() {
        if (currentAge == maxAge) {
            // Does Birthday
        }
    }
    
}
