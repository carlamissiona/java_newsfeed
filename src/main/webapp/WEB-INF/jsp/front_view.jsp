<jsp:include page="skel/header.jsp" /> 
				<!-- Main -->
					<div id="main">

						<!-- One -->
							<section id="one" class="tiles">
							 
								
							</section>
		</div>
<script>

console.log(<%= request.getAttribute("feeds") %>);
var res= <%= request.getAttribute("feeds") %>;

var posts = res.response.results;



</script> 
<jsp:include page="skel/footer.jsp" /> 
			