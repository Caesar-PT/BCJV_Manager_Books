public class Main {
    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook(1, "Java cơ bản", 5, "author1","Java", "Framework1");
        programmingBooks[1] = new ProgrammingBook(2, "PHP cơ bản", 3, "author2","PHP", "Framework2");
        programmingBooks[2] = new ProgrammingBook(3, "Java nâng cao", 7, "author3","Java", "Framework3");
        programmingBooks[3] = new ProgrammingBook(4, "Ruby cơ bản", 9, "author4","Ruby", "Framework4");
        programmingBooks[4] = new ProgrammingBook(5, "C cơ bản", 5, "author5","C", "Framework5");

        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook(1, "Người Truyền Ký Ức", 15, "Jonas", "Huyền Huyễn", 10);
        fictionBooks[1] = new FictionBook(2, "Tam Thể", 17, "UD", "Kinh Dị", 12);
        fictionBooks[2] = new FictionBook(3, "Trạm Tín Hiệu Số 23", 15, "Hugh Howey", "Viễn Tưởng", 15);
        fictionBooks[3] = new FictionBook(4, "Người Về Từ Sao Hỏa", 19, "Mark Watney", "Viễn Tưởng", 10);
        fictionBooks[4] = new FictionBook(5, "Cỗ Máy Thời Gian", 18, "Wells", "Viễn Tưởng", 10);

        double sumTotalBooks = 0;
        double sumProgrammingBooks = 0;
        double sumFictionBooks = 0;
        int countJava =0;
        double sumPromotionalPrice = 0;
        double tongkhuyenmai = 0;

        for (ProgrammingBook p:
             programmingBooks) {
            if (p.getLanguage().equals("Java")){
                countJava++;
            }
            sumProgrammingBooks += p.getPrice();
        }
        for (FictionBook f:
             fictionBooks) {
            sumFictionBooks += f.getPrice();

        }

        for (FictionBook f:
             fictionBooks ) {
            sumPromotionalPrice += f.setDiscount(5);
        }

        tongkhuyenmai = sumFictionBooks - sumPromotionalPrice;


        sumTotalBooks = sumProgrammingBooks + sumFictionBooks;

        System.out.println("Tổng số tiền sách Programming: " + sumProgrammingBooks);
        System.out.println("Tổng số tiền sách Fiction: " + sumFictionBooks);
        System.out.println("Tổng số tiền sách: " + sumTotalBooks);
        System.out.println("Tổng số tiền sách Fiction sau khuyến mãi: " + sumPromotionalPrice);
        System.out.println("Tổng tiền khuyến mãi: " + tongkhuyenmai);
        System.out.println("CountJava: " + countJava);
    }
}
