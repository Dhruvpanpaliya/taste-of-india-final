package com.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.test.Entities.Manager;
import com.test.Service.ManagerService;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/managers")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @PostMapping("/register")
    public Manager registerManager(@RequestBody Manager manager) {
        return managerService.registerManager(manager);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Manager>> getAllManagers() {
        List<Manager> managers = managerService.getAllManagers(); // Assuming getAllManagers() is implemented in the
                                                                  // service
        return ResponseEntity.ok(managers); // Returns 200 OK with the list of managers
    }

    @PutMapping("/update/{managerId}")
    public Manager updateManager(@PathVariable UUID managerId, @RequestBody Manager updatedManager) {
        return managerService.updateManager(managerId, updatedManager);
    }

    @PostMapping("/upload-profile-picture/{managerId}")
    public ResponseEntity<String> uploadProfilePicture(@PathVariable UUID managerId,
            @RequestParam("file") MultipartFile file) {
        try {
            String filePath = managerService.uploadProfilePicture(managerId, file);
            return ResponseEntity.ok("Profile Picture uploaded at: " + filePath);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to upload profile picture.");
        }
    }

    @PostMapping("/upload-aadhar-card/{managerId}")
    public ResponseEntity<String> uploadAadharCard(@PathVariable UUID managerId,
            @RequestParam("file") MultipartFile file) {
        try {
            String filePath = managerService.uploadAadharCard(managerId, file);
            return ResponseEntity.ok("Aadhar Card uploaded at: " + filePath);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to upload Aadhar Card.");
        }
    }
}
