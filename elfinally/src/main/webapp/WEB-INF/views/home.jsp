<thead>
    <tr>
        <th style="text-align: center">Choose</th>
        <th style="text-align: center">ID</th>
        <th style="text-align: center">First Name</th>
        <th style="text-align: center">Last Name</th>
        <th style="text-align: center">Mark</th>
    </tr>
</thead>
<tbody>
    <c:if test="${not empty studentList}">
        <c:forEach var="student" items="${studentList}" varStatus="STT">
            <tr>
                <td align="center">
                    <div class="icheck-list">
                        <input type="radio" id="" value="${STT.index+1}" 
                               name="Oamuser_InGroup_1" 
                               onclick="Oamuser_Js_getRowSelected()">
                    </div>
                </td>
                <td align="center">${student.id}</td>
                <td align="center">${student.firstName}</td>
                <td align="center">${student.lastName}</td>
                <td align="center">${student.marks}</td>
            </tr>
        </c:forEach>
    </c:if>
</tbody>