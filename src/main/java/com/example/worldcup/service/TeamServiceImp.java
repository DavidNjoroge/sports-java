package com.example.worldcup.service;

import com.example.worldcup.model.Team;
import com.example.worldcup.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeamServiceImp implements TeamService {
    @Autowired
    TeamRepository teamRepository;

    @Override
    public List<Team> findAllTeams() {
        return teamRepository.findAll();
    }

//    @Override
//    public void bulkCreate (Long voucherDefinition, int count, int amount, LocalDateTime startDate, LocalDateTime endDate, Writer writer) throws IOException {
//
//    }

//    @Override
//    @Transactional
//    public void bulkCreate(Long voucherDefinitionId, int count, int amount, LocalDateTime startDate, LocalDateTime endDate, Writer writer) throws IOException {
////        VoucherDefinition voucherDefinition = voucherDefinitionRepository.findDefinitionById(voucherDefinitionId);
//
////        todo
////        if(voucherDefinition == null){
////            throw new ChangeSetPersister.NotFoundException ("error.voucherDefinition.notfound");
////        }
//        List<String[]> voucherData = new ArrayList<> ();
//        for (int i = 1; i <= count; i++) {
//            //requires a voucher definition to have a code,
//            Team voucher = new Team(voucherDefinition, generateCode(), amount,startDate,endDate);
//            voucherData.add(new String[] {voucher.getReference(),voucher.getAmount().getAmount().toString(), startDate.toString(),endDate.toString()});
//            voucherRepository.save(voucher);
//        }
//        CSVWriter csvWriter = new CSVWriter(writer);
//
//        final String[] CSV_HEADER = new String[]{"Voucher Code", "Amount ("+voucherDefinition.getProgram().getCurrency()+")","Start Date","End Date"};
//        csvWriter.writeNext(CSV_HEADER);
//        csvWriter.writeAll(voucherData);
//        csvWriter.flush();
//    }

}
