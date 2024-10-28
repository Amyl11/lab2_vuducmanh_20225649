
public class cart {
    public static final int MAX = 20;

    private DVD itemsOrdered[] = new DVD[MAX];
    private int qtyOrdered;

    public int addDVD(DVD disc) {
        if (qtyOrdered == MAX) {
            System.out.println("Can't order more, please pay this bill first");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The DVD " + '\"' +disc.getTitle() + '\"' + "added!");
            return 1;
        }
    }

    public int addDVD(DVD... dvdArray) {
        int addCount = 0;
        for (DVD disc : dvdArray) {
            if (qtyOrdered == MAX) {
                System.out.println("Can't order more, please pay this bill first");
                break;
            } else {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The DVD " + '\"' + disc.getTitle() + '\"' + "added!");
                addCount++;
            }
        }
        return addCount;
    }


    public int removeDVD(DVD disc) {
        if(itemsOrdered[0] ==  null) {
            System.out.println("Nothing here!");
            return 0;
        }
        for(int i =0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].equals(disc)) {
                for(int j = i; j<qtyOrdered-1; j++) {
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Removed " + '\"'+ disc.getTitle() + '\"');
                return 1;
            }
        }
        System.out.println("Can't found DVD");
        return 0;
    }

    public float totalCost() {
        float sum = 0.00f;
        for(int i =0;i< qtyOrdered;i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }


    public void searchById(int i) {
        if(i > qtyOrdered) {
            System.out.println("Not found!");
        } else {
            System.out.println("Result: " +  "[" + itemsOrdered[i-1].getTitle() +
                    "] - [" + itemsOrdered[i-1].getCategory() + "] - ["
                    + itemsOrdered[i-1].getDirector() + "] - ["
                    + itemsOrdered[i-1].getLength() + "]: " +itemsOrdered[i-1].getCost() + " $\n");
        }

    }

    public void searchByTitle(String title) {
        for(int i = 0;i < qtyOrdered; i++) {
            if(itemsOrdered[i].getTitle().equals(title)) {
                System.out.println("Result: " +  "[" + itemsOrdered[i].getTitle() +
                        "] - [" + itemsOrdered[i].getCategory() + "] - ["
                        + itemsOrdered[i].getDirector() + "] - ["
                        + itemsOrdered[i].getLength() + "]: " +itemsOrdered[i].getCost() + " $\n");
                return;
            }
        }
        System.out.println("Not found !");
    }
}