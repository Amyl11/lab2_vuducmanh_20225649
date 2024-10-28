public class AIMS {
    public static void main(String[] args) {

        cart anOrder = new cart();

        DVD dvd1 = new DVD("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        anOrder.addDVD(dvd1);
        DVD dvd2 = new DVD("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        anOrder.addDVD(dvd2);
        DVD dvd3 = new DVD("Aladin","Animation",18.99f);
        anOrder.addDVD(dvd3);

        anOrder.print();

        anOrder.removeDVD(dvd2);
        System.out.printf("Total cost is: %.2f",anOrder.totalCost());
    }
}