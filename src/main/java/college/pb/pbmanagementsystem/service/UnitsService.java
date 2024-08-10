package college.pb.pbmanagementsystem.service;

import college.pb.pbmanagementsystem.model.dto.UnitsDto;
import college.pb.pbmanagementsystem.model.entity.Units;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public interface UnitsService
{
    Units createUnits(UnitsDto units);
    Units getUnitsById(Long id);
    Units updateUnits(UnitsDto user);
    void deleteUnitsById(Long id);

}
