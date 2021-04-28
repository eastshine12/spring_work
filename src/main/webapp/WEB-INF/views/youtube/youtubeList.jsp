<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<div id="_youtube_">
	<iframe id="_youtube" width="640" height="360" src="http://www.youtube.com/embed/"
		frameborder="0" allowfullscreen>
	</iframe>
</div>


<div id="myDatas">
	<table class="list_table" style="width: 85%;">
		<col width="70px"><col style="width:auto"><col width="100px"><col width="10px">
		<thead>
			<tr>
				<th>순서</th>
				<th>제목</th>
				<th>유튜브 고유번호</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty youList}">
			<tr>
				<td colspan="4">저장된 동영상이 없습니다.</td>
			</tr>
			</c:if>
			
			<c:forEach items="${youList }" var="you" varStatus="i">
			<tr class="_hover_tr">
				<td>${i.count }</td>
				<td style="text-align: left;">
					<a class="c_vname" vname="${you.url }">${you.title }</a>
				</td>
				<td>${you.url }</td>
				<td>
					<img alt="" src="image/del.png" class="ck_seq" seq='${you.seq }'>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>



<script>
$(document).ready(function() {
	$('#_youtube').hide();
});

$('.c_vname').click(function() {
	$('#_youtube').show();
	$('#_youtube').attr("src", "http://www.youtube.com/embed/"+ $(this).attr("vname"));
	
})

</script>

