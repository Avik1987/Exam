public  class PlanService extends Plan implements PlanServiceCod {
    public PlanService(String model, String country,
                       int year, int hours, boolean military,
                       int weight, int wingspan, int topSpeed,
                       int seats, double cost) {
        super(model, country, year, hours, military, weight, wingspan, topSpeed, seats, cost);
    }




    Plan a = new Plan() {




        Plan b = new Plan() {


            @Override
            public Plan Task3(Plan a, Plan b) {
                if (a.getYear() >= b.getYear()) {
                    return a;
                }
                return b;

            }


            @Override
            public String Task4(Plan a, Plan b) {
                if (a.getWingspan() >= b.getWingspan()) {
                    return a.getModel();
                } else return b.getModel();

            }
        };

    };

    @Override
    public void Task1(Plan a) {

    }

    @Override
    public Plan Task3(Plan a, Plan b) {
        return null;
    }

    @Override
    public String Task4(Plan a, Plan b) {
        return null;
    }

    @Override
    public void Task5(Plan a, Plan b, Plan c) {
        if (a.getSeats() < b.getSeats() && a.getSeats() < c.getSeats()) {
            System.out.println(a.getCountry());
        } else if (b.getSeats() < a.getSeats() && b.getSeats() < c.getSeats()) {
            System.out.println(b.getCountry());
        } else System.out.println(c.getCountry());
    }

    @Override
    public void Task6(Plan[] abs) {
        for (int i = 0; i < abs.length; i++) {
            if (isMilitary()) {
            } else abs[i].printInfo();

        }

    }

    @Override
    public void Task7(Plan[] abs) {
        for (int i = 0; i < abs.length; i++) {
            if (isMilitary()) {
                if (abs[i].getHours() > 100) {
                    abs[i].printInfo();
                }
            }

        }

    }

    @Override
    public Plan Task8(Plan[] abs) {
        Plan min = abs[0];
        for (int i = 1; i < abs.length; i++) {
            if (abs[i].getWeight() <= min.getWeight()) {
                min = abs[i];
            }
        }
        return min;
    }

    @Override
    public Plan Task9(Plan[] abs) {
        Plan minCost = null;
        for (int i = 0; i < abs.length; i++) {


            if (minCost == null) {
                if (isMilitary()) {
                    minCost = abs[i];
                }
            }

            if (abs[i].isMilitary() && abs[i].getCost() < minCost.getCost()) {
               return minCost=abs[i];
            }

        }
if (minCost!=null)return minCost;

        return minCost;
    }

    @Override
    public void Task10(Plan[] abs) {
   Plan Temp= null;
        for (int i = 1; i < abs.length; i++) {
            if (abs[i-1].getYear()<abs[i].getYear()){
                Temp=abs[i];
                abs[i-1]=abs[i];
                abs[i-1]=Temp;

            }

        }
        for (Plan a:abs) {a.printInfo();}
    }

}
