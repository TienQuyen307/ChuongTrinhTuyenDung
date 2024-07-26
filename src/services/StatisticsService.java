package services;

import models.Candidate;
import models.School;

import java.util.Map;

public class StatisticsService {
    public void printStatistics(Map<String, Candidate> candidates, Map<String, School> schools, String[] candidateIds) {
        int passCount = 0;
        int failCount = 0;
        int noResultCount = 0;

        for (String candidateId : candidateIds) {
            Candidate candidate = candidates.get(candidateId);
            if (candidate == null) {
                System.out.println("Ứng viên với mã " + candidateId + " không tồn tại.");
                continue;
            }

            School school = schools.get(candidate.getSchoolId());
            if (school == null) {
                System.out.println("Ứng viên " + candidate.getName() + " chưa có dữ liệu về trường học.");
                continue;
            }

            System.out.println("Thông tin ứng viên:");
            System.out.println("Mã ứng viên: " + candidate.getCandidateId());
            System.out.println("Họ tên: " + candidate.getName());
            System.out.println("Năm sinh: " + candidate.getBirthYear());
            System.out.println("Vị trí ứng tuyển: " + candidate.getPosition());
            System.out.println("Trường học: " + school.getName() + " (" + school.getSchoolId() + ")");
            System.out.println("Email trường: " + school.getEmail());
            System.out.println("Lĩnh vực đào tạo: " + school.getFieldOfStudy());

            if (candidate.getResult() == null) {
                System.out.println("Ứng viên chưa có kết quả");
                noResultCount++;
            } else {
                System.out.println("Kết quả: " + candidate.getResult());
                if (candidate.getResult().equalsIgnoreCase("Pass")) {
                    passCount++;
                } else {
                    failCount++;
                }
            }
            System.out.println("----------------------");
        }

        System.out.println("Thống kê:");
        System.out.println("Số ứng viên Pass: " + passCount);
        System.out.println("Số ứng viên Fail: " + failCount);
        System.out.println("Số ứng viên chưa có thông tin: " + noResultCount);
    }
}
