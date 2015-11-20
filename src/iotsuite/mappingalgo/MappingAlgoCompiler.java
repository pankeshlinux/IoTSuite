package iotsuite.mappingalgo;

import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MappingAlgoCompiler {

	private static int j;
<<<<<<< HEAD

=======
	
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
	public static Map<String, Set<String>> mappingOutputForLinker = new HashMap<String, Set<String>>();
	public static Map<String, String> mappingOutputBuiltInSoftwareComponentForLinker = new HashMap<String, String>();

	public static Map<Device, Set<String>> mapTasks(List<Device> deviceList,
			List<DeploymentScope> mappingConstraintList) {

		List<Device> tempDeviceList = new ArrayList<Device>();
		List<String> tempSoftwareComponentList = new ArrayList<String>();
		final Map<Device, Set<String>> finalMapping = new HashMap<Device, Set<String>>();

		for (Device deviceObj : deviceList) {
			tempDeviceList.add(deviceObj);
		}
		for (DeploymentScope mc : mappingConstraintList) {
			tempSoftwareComponentList.add(mc.getSoftwareComponentName());
<<<<<<< HEAD
			mappingOutputBuiltInSoftwareComponentForLinker.put(
					mc.getSoftwareComponentName(),
					mc.getSoftwareComponentType());
=======
			mappingOutputBuiltInSoftwareComponentForLinker.put
					(mc.getSoftwareComponentName(), mc.getSoftwareComponentType());		    
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
		}

		for (int i = 0; i < tempDeviceList.size(); i++) {

<<<<<<< HEAD
			if (tempDeviceList.get(i).getAbilities().isEmpty()) { // This is for
																	// devices
																	// with NULL
																	// abilities
																	// ....

=======
			if (tempDeviceList.get(i).getAbilities().isEmpty()) { // This is for devices with NULL abilities ....  
									
				
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
				// For Software Component - Custom
				Set<String> tempsc = new HashSet<String>();
				tempsc.add(tempSoftwareComponentList.get(j));
				tempsc.add("false");
<<<<<<< HEAD
				String softwareComponentType = mappingOutputBuiltInSoftwareComponentForLinker
						.get(tempSoftwareComponentList.get(j));
				tempsc.add(softwareComponentType);

				mappingOutputForLinker.put(tempDeviceList.get(i).getName(),
						tempsc);

				// False abilities have been removed ....
				Set<String> tempscForFinalOutputVaribale = new HashSet<String>();
				tempscForFinalOutputVaribale.add(tempSoftwareComponentList
						.get(j));
				finalMapping.put(tempDeviceList.get(i),
						tempscForFinalOutputVaribale);
				j++;
			} else {
				finalMapping.put(tempDeviceList.get(i), tempDeviceList.get(i)
						.getAbilities());
				Set<String> tempSoftwareComponentWithAbilities = new HashSet<String>();
				tempSoftwareComponentWithAbilities.addAll(tempDeviceList.get(i)
						.getAbilities());
				tempSoftwareComponentWithAbilities.add("true");
				tempSoftwareComponentWithAbilities.add("NoType");
				mappingOutputForLinker.put(tempDeviceList.get(i).getName(),
						tempSoftwareComponentWithAbilities);
=======
				String softwareComponentType = mappingOutputBuiltInSoftwareComponentForLinker.get(tempSoftwareComponentList.get(j));
				tempsc.add(softwareComponentType);
				
				mappingOutputForLinker.put(tempDeviceList.get(i).getName(), tempsc);

				// False abilities have been removed ....
				Set<String> tempscForFinalOutputVaribale = new HashSet<String>();
				tempscForFinalOutputVaribale.add(tempSoftwareComponentList.get(j));		
				finalMapping.put(tempDeviceList.get(i), tempscForFinalOutputVaribale);
				j++;
			} else {
				finalMapping.put(tempDeviceList.get(i), tempDeviceList.get(i).getAbilities());
				Set<String> tempSoftwareComponentWithAbilities  = new HashSet<String>();
				tempSoftwareComponentWithAbilities.addAll(tempDeviceList.get(i).getAbilities());
				tempSoftwareComponentWithAbilities.add("true");
				tempSoftwareComponentWithAbilities.add("NoType");
				mappingOutputForLinker.put(tempDeviceList.get(i).getName(), tempSoftwareComponentWithAbilities );
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
			}
		}
		return finalMapping;
	}
}
