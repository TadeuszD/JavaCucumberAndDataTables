package StepfDef;

import Calculator.Calc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StepDefDataTable {

    HashMap<String, String> replaceMap = new HashMap<>();
    List<List<String>> listRows;


    @Given("DataTable as List is initialized")
    public void DataTable_as_List_is_initialized() {
        System.out.println("Catch parameters in DataTable as List");
    }

    @Given("DataTable as Map is initialized")
    public void DataTable_as_Map_is_initialized() {
        System.out.println("Catch parameters in DataTable as Map");
    }

    @When("I read parameters by DataTable as Lists")
    public void i_read_parameters_by_DataTable(DataTable dataTable) {
        listRows = dataTable.asLists();
    }

    @Then("I print parameters by List")
    public void IprintparametersbyList() {
        System.out.println(" Parameters from DataTable : ");
        for (List<String> columns : listRows) {
            System.out.println("____________________________________");
            System.out.println("column1 : " + columns.get(0) + " ");
            System.out.println("column2 : " + columns.get(1) + " ");
        }
    }

    @When("I read parameters by Map")
    public void iReadParametersByMap(DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists();

        for (List<String> row : lists) {
            String oldval = row.get(0);
            String newval = row.get(1);
            replaceMap.put(oldval, newval);
        }
    }


    @Then("I print parameters by Map")
    public void IprintparametersbyMap() {
        for (Map.Entry<String, String> entry : replaceMap.entrySet()) {
            System.out.println(" ------- next entry ------ ");
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}