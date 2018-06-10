package com.example.worldcup.controller;

import com.example.worldcup.model.Team;
import com.example.worldcup.repository.TeamRepository;
import com.example.worldcup.service.TeamService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/teams")
@Api(value = "allteams")
public class TeamController {

    @Autowired
    TeamService teamService;

    @Autowired
    TeamRepository teamRepository;

//    @Autowired
//    voucherService
    private List<Team[]> team;

    @GetMapping("")
    public List<Team> getAllTeams() {
        return teamService.findAllTeams();
    }

    @PostMapping("")
//    @RequestBody List <Stuff> stuffs
    public Team[] createTeam(@Valid @RequestBody Team[] teams) {

        System.out.println ( teams );
        for (Team team: teams) {
//            beneficiaryAccount.getAccount().getProgram().toString(); // force loading of program
            teamRepository.save(team);
        }

        return teams;
    }

@PostMapping(value = "/bulk")
public ResponseEntity<String> uploadAttendee(@RequestParam("file") MultipartFile file) {

    String message = "";
//    logger.debug("Uplo");
//    System.out.println (file.getF);
//    CsvSchema bootstrapSchema = CsvSchema.emptySchema().withHeader();
//    CsvMapper mapper = new CsvMapper ();
//    MappingIterator<Team> readValues = mapper.readerFor(Team.class).with(bootstrapSchema).readValues(file);
//    List<Team> allValues= readValues.readAll();
    return ResponseEntity.status(HttpStatus.OK).body(message);







}
//
//    @RequestMapping(value="definitions/{voucherDefinitionId}/bulk", method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.OK)
//    public void bulkVouchers(@PathVariable("voucherDefinitionId") Long voucherDefinitionId, @RequestBody BulkVoucherRequest bulkVoucherRequest, HttpServletResponse httpResponse) throws IOException {
//        httpResponse.setContentType("text/csv");
//        teamService.bulkCreate(voucherDefinitionId,bulkVoucherRequest.getCount(),bulkVoucherRequest.getAmount(), bulkVoucherRequest.getStartDate(),bulkVoucherRequest.getEndDate(),httpResponse.getWriter());
//    }
//
//
//    private static class BulkVoucherRequest {
//        private int count;
//        private int amount;
//        private LocalDateTime startDate;
//        private LocalDateTime endDate;
//        public int getCount() {
//            return count;
//        }
//
//        public void setCount(int count) {
//            this.count = count;
//        }
//
//        public int getAmount() {
//            return amount;
//        }
//
//        public void setAmount(int amount) {
//            this.amount = amount;
//        }
//
//        public LocalDateTime getStartDate() {
//            return startDate;
//        }
//
//        public void setStartDate(LocalDateTime startDate) {
//            this.startDate = startDate;
//        }
//
//        public LocalDateTime getEndDate() {
//            return endDate;
//        }
//
//        public void setEndDate(LocalDateTime endDate) {
//            this.endDate = endDate;
//        }
//    }

}

