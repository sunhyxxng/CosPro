package com.cospro.version05;

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
        public int workHour;
        public int payPerHour;

        public PartTimeJob(int workHour, int payPerHour) {
            this.workHour = workHour;
            this.payPerHour = payPerHour;
        }

        @Override
        public int getSalary() {
            salary = workHour * payPerHour;
            if (workHour >= 40) {
                salary += (payPerHour * 8);
            }
            return salary;
        }
    }

    class SalesJob extends Job {
        public int salesResult;
        public int payPerSale;

        public SalesJob(int salesResult, int payPerSale) {
            this.salesResult = salesResult;
            this.payPerSale = payPerSale;
        }

        @Override
        public int getSalary() {
            int extra = 1;
            if (salesResult > 20) {
                extra = 3;
            } else if (salesResult > 10) {
                extra = 2;
            }
            return salesResult * payPerSale * extra;
        }
    }

    public int solution(int[][] partTimeJobs, int[][] salesJobs) {
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
        Question10 sol = new Question10();
        int[][] partTimeJobs = {{10, 5000}, {43, 6800}, {5, 12800}};
        int[][] salesJobs = {{3, 18000}, {12, 8500}};
        System.out.println(sol.solution(partTimeJobs, salesJobs));
    }
}
