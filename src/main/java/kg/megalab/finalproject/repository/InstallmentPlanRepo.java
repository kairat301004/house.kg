package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.InstallmentPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstallmentPlanRepo extends JpaRepository<InstallmentPlan, Integer> {
}
