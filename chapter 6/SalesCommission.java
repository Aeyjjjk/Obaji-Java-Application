public class SalesCommission {
    public static void main(String[] args) {
        int[] salaryRanges = new int[9]; // Index 0 for $200-299, 1 for $300-399, ..., 8 for $1000 and over

        int[] grossSales = {5000, 7000, 3000, 1500, 8000, 12000}; // Sample sales data

        for (int sales : grossSales) {
            int salary = 200 + (int)(sales * 0.09);
            int index;

            if (salary >= 1000) index = 8;
            else index = (salary - 200) / 100;

            salaryRanges[index]++;
			//System.out.println(sales);
        }

        
        System.out.println("Salary Range\tNumber of Salespeople");
        for (int i = 0; i < salaryRanges.length; i++) {
            if (i == 8)
                System.out.printf("$1000 and over:\t%d%n", salaryRanges[i]);
            else
                System.out.printf("$%d–%d:\t\t%d%n", 200 + i * 100, 299 + i * 100, salaryRanges[i]);
        }
    }
}