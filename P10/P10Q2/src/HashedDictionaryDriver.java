
public class HashedDictionaryDriver {

    public static void main(String[] args) {
        DictionaryInterface<Integer, Student> studentTable = new HashedDictionary<>(7);
        Student test = new Student();
        /*  NOTE:   Key 		Hash index
                    ----		----------
                    4145			1
                    1234			2
                    5478			4
                    7888			6
                    9999			3
         */
        /*//1658
        studentTable.add(test.hashCode(4145414541454145L), new Student(4145414541454145L, "Ben Tennyson", 2.5678));
        //4936
        studentTable.add(test.hashCode(1234123412341234L), new Student(1234123412341234L, "Dan Brown", 4.0000));
        //2191
        studentTable.add(test.hashCode(5478547854785478L), new Student(5478547854785478L, "Mary Lee", 3.7800));
        //3155
        studentTable.add(test.hashCode(7888788878887888L), new Student(7888788878887888L, "Lisa Wong", 2.9888));
        //3999
        studentTable.add(test.hashCode(9999999999999999L), new Student(9999999999999999L, "Jay Chou", 1.9999));
        */
        /*studentTable.add(4145, new Student(4145, "Ben Tennyson", 2.5678));
        studentTable.add(1234, new Student(1234, "Dan Brown", 4.0000));
        studentTable.add(5478, new Student(5478, "Mary Lee", 3.7800));
        studentTable.add(7888, new Student(7888, "Lisa Wong", 2.9888));
        studentTable.add(9999, new Student(9999, "Jay Chou", 1.9999));
        System.out.println("\nstudentTable: \n" + studentTable);
        System.out.println("Total entries = " + studentTable.getSize());*/

        /*  NOTE:   Key 		Hash index
                    ----		----------
                    9101			1
                    2332			1
                    1213			2
                    6787			4
         */
        /*System.out.println("\nAfter inserting 9101, 2332, 1213, 6787: ");
        studentTable.add(9101, new Student(9101, "Anna Lewis", 2.5678));
        studentTable.add(2332, new Student(2332, "Pete Sampras", 4.0000));
        studentTable.add(1213, new Student(1213, "Meg Ryan", 3.7800));
        studentTable.add(6787, new Student(6787, "Cat Deeley", 2.9888));*/
        //3640
        studentTable.add(test.hashCode(9101910191019101L), new Student(9101910191019101L, "Ben Tennyson", 2.5678));
        //9328
        studentTable.add(test.hashCode(2332233223322332L), new Student(2332233223322332L, "Dan Brown", 4.0000));
        //4852
        studentTable.add(test.hashCode(1213121312131213L), new Student(1213121312131213L, "Mary Lee", 3.7800));
        //2714
        studentTable.add(test.hashCode(6787678767876787L), new Student(6787678767876787L, "Lisa Wong", 2.9888));
        System.out.println("\n" + studentTable);
        System.out.println("Total entries = " + studentTable.getSize());
    }
}
