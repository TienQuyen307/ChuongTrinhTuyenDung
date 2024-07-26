package services;

import models.Candidate;
import java.util.HashMap;
import java.util.Map;

public class CandidateService {
    private Map<String, Candidate> candidates = new HashMap<>();

//    thêm ứng viên
    public void addCandidate(Candidate candidate) {
        candidates.put(candidate.getCandidateId(), candidate);
    }

//    lấy thông tin ứng viên
    public Candidate getCandidate(String candidateId) {
        return candidates.get(candidateId);
    }

//    lấy danh sách tất cả ứng viên
    public Map<String, Candidate> getAllCandidates() {
        return candidates;
    }
}
