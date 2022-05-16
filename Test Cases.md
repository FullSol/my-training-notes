# Test Cases**getAllCustomers**1. getAllCustomers gets called successfully and returns mock data2. SQLException should be thrown from getAllCustomers if our mock customerDao throws a SQL Exception**addCustomer**1. Positive scenario (no exception is thrown because Customer info we would like to add is all valid)* age is positive* email follows the xxx@xxx format**Negative scenarios**1. Exception should be thrown if age is negative, email is valid2. Exception should be thrown if age is positive, email is invalid3. Exception should be thrown if age is negative AND email is invalid

4. SQLException should be thrown from add customer if our mock customerDao throws a SQL Exception

