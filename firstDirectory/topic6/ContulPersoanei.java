package firstDirectory.topic6;

public class ContulPersoanei {
    private String personName;
    private int id;
    private double sumaCurenta;

    public ContulPersoanei(String personName, int id, double sumaCurenta) {
        this.personName = personName;
        this.id = id;
        this.sumaCurenta = sumaCurenta;
    }

    public void initialBalanceSet(double initBalance) {
        setSumaCurenta(initBalance);
        System.out.println(initBalance);
    }


    public void sustragereDeBani(double susSum) {
        double currentSum = getSumaCurenta();
        if (currentSum <= 0) {
            throw new RuntimeException("Cannot withdraw money from the account");
        } else
            currentSum -= susSum;
        System.out.println("New Balance " + currentSum);

    }


    public void transferCatreOPersoana(double addBalane) {
        try {
            getId();
        } catch (NullPointerException e) {
        };

        getPersonName();
        getSumaCurenta();


    }

    private String getPersonName() {
        return personName;
    }

    private void setPersonName(String personName) {
        this.personName = personName;
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private double getSumaCurenta() {
        return sumaCurenta;
    }

    private void setSumaCurenta(double sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }
}
