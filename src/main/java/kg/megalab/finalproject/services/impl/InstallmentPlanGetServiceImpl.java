package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.InstallmentPlan;
import kg.megalab.finalproject.repository.InstallmentPlanRepo;
import kg.megalab.finalproject.services.InstallmentPlanGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InstallmentPlanGetServiceImpl implements InstallmentPlanGetService {
    private final InstallmentPlanRepo installmentPlanRepo;

    public InstallmentPlanGetServiceImpl(InstallmentPlanRepo installmentPlanRepo) {
        this.installmentPlanRepo = installmentPlanRepo;
    }

    @Override
    public List<InstallmentPlan> getAllFromInstallmentPlan() {
        List<InstallmentPlan> installmentPlans = installmentPlanRepo.findAll();
        return installmentPlans;
    }
}
