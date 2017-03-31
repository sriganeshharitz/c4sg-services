package org.c4sg.service;

import java.util.List;

import org.c4sg.dto.OrganizationDTO;
import org.c4sg.dto.ProjectDTO;

public interface OrganizationService {

	void save(OrganizationDTO organizationDTO);
    void deleteOrganization(int id);
    String getLogoUploadPath(Integer organizationId);
    OrganizationDTO findById(int id);
    OrganizationDTO createOrganization(OrganizationDTO organizationDTO);
    OrganizationDTO updateOrganization(int id, OrganizationDTO organizationDTO);
    List<OrganizationDTO> findOrganizations();
    List<OrganizationDTO> findByKeyword(String name);
    List<OrganizationDTO> findByUser(Integer userId);
}