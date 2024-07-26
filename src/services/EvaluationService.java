package services;

import models.Candidate;

public class EvaluationService {
//    thiết lập kết quả Pass / fail
    public void evaluateCandidate(Candidate candidate, String result) {
        candidate.setResult(result);
    }
}
