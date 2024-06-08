package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.TransactionType;
import kg.megalab.finalproject.repository.TransactionTypeRepo;
import kg.megalab.finalproject.services.TransactionTypeGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionTypeGetServiceImpl implements TransactionTypeGetService {
    private final TransactionTypeRepo transactionTypeRepo;

    public TransactionTypeGetServiceImpl(TransactionTypeRepo transactionTypeRepo) {
        this.transactionTypeRepo = transactionTypeRepo;
    }

    @Override
    public List<TransactionType> getAllFromTransactionType() {
        List<TransactionType> transactionTypeList = transactionTypeRepo.findAll();
        return transactionTypeList;
    }
}
