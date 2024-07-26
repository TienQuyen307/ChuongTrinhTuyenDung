package main;

import models.Candidate;
import models.School;
import services.CandidateService;
import services.EvaluationService;
import services.StatisticsService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CandidateService candidateService = new CandidateService();
        EvaluationService evaluationService = new EvaluationService();
        StatisticsService statisticsService = new StatisticsService();

        // Pre-defined school data
        Map<String, School> schools = new HashMap<>();
        schools.put("S001", new School("S001", "Trường Đại Học A", "contact@universitya.edu", "Công nghệ thông tin"));
        schools.put("S002", new School("S002", "Trường Đại Học B", "contact@universityb.edu", "Kinh tế"));

        // Sample data for testing
        candidateService.addCandidate(new Candidate("C001", "Nguyễn Văn A", 1995, "S001", "Kỹ sư phần mềm"));
        candidateService.addCandidate(new Candidate("C002", "Trần Thị B", 1996, "S002", "Nhân viên kinh doanh"));

        Scanner scanner = new Scanner(System.in);

        // Step 2.2: Enter candidate information
        System.out.println("Nhập thông tin ứng viên (để trống để kết thúc): ");
        while (true) {
            System.out.print("Mã ứng viên: ");
            String candidateId = scanner.nextLine();
            if (candidateId.isEmpty()) break;

            System.out.print("Họ tên: ");
            String name = scanner.nextLine();

            System.out.print("Năm sinh: ");
            int birthYear = Integer.parseInt(scanner.nextLine());

            System.out.print("Mã trường học: ");
            String schoolId = scanner.nextLine();

            System.out.print("Vị trí ứng tuyển: ");
            String position = scanner.nextLine();

            candidateService.addCandidate(new Candidate(candidateId, name, birthYear, schoolId, position));
        }

        // Step 2.3: Evaluate candidate
        System.out.println("Đánh giá ứng viên: ");
        while (true) {
            System.out.print("Mã ứng viên: ");
            String candidateId = scanner.nextLine();
            if (candidateId.isEmpty()) break;

            Candidate candidate = candidateService.getCandidate(candidateId);
            if (candidate == null) {
                System.out.println("Ứng viên không tồn tại.");
                continue;
            }

            System.out.print("Kết quả (Pass/Fail): ");
            String result = scanner.nextLine();
            evaluationService.evaluateCandidate(candidate, result);
        }

        // Step 2.4: Print statistics
        System.out.println("Nhập danh sách mã ứng viên để thống kê (cách nhau bởi dấu phẩy): ");
        String[] candidateIds = scanner.nextLine().split(",");

        statisticsService.printStatistics(candidateService.getAllCandidates(), schools, candidateIds);
    }
}
