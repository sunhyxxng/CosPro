package com.cospro.version06;

public class Question10 {
    class Job {
        public int salary;
        public Job() {
            this.salary = 0;
        }
        public int getSalary() {
            return salary;
        }
    }

    class PartTimeJob extends Job {
        private int workHour;
        private int payPerHour;
        public PartTimeJob(int workHour, int payPerHour) {
            this.workHour = workHour;
            this.payPerHour = payPerHour;
        }
        public int getSalary() {
            salary = workHour * payPerHour;
            if (workHour >= 40) {
                salary += (payPerHour * 8);
            }
            return salary;
        }
    }

    class SalesJob extends Job {
        private int salesResult;
        private int payPerSale;
        public SalesJob(int salesResult, int payPerSale) {
            this.salesResult = salesResult;
            this.payPerSale = payPerSale;
        }
        public int getSalary() {
            if (salesResult > 20) {
                salary = salesResult * payPerSale * 3;
            } else if (salesResult > 10) {
                salary = salesResult * payPerSale * 2;
            } else {
                salary = salesResult * payPerSale;
            }
            return salary;
        }
    }

    public int getAllEmployeeSalaries(int[][] partTimeJobs, int[][] salesJobs) {
        int answer = 0;

        for (int i = 0; i < partTimeJobs.length; i++) {
            PartTimeJob partTimeJob = new PartTimeJob(partTimeJobs[i][0], partTimeJobs[i][1]);
            answer += partTimeJob.getSalary();
        }

        for (int i = 0; i < salesJobs.length; i++) {
            SalesJob salesJob = new SalesJob(salesJobs[i][0], salesJobs[i][1]);
            answer += salesJob.getSalary();
        }
        return answer;
    }

    public static void main(String[] args) {
        Question10 solution = new Question10();
        int[][] partTimeJobs = {{10, 5000}, {43, 6800}, {5, 12800}};
        int[][] salesJobs = {{3, 18000}, {12, 8500}};
        int result = solution.getAllEmployeeSalaries(partTimeJobs, salesJobs);
        System.out.println(result);
    }
}
