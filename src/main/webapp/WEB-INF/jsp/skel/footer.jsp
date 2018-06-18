	<!-- Contact -->
					<section id="contact">
						<div class="inner">
							<section>
							    <h4>Join Us</h4>
								<form method="post" action="/springer/signup">
									<div class="fields">
										<div class="field half">
											<label for="name">First Name</label>
											<input type="text" name="fname" id="name" />
										</div>
										<div class="field half">
											<label for="lname">Last Name</label>
											<input type="text" name="lname" id="lname" />
										</div>
										<div class="field half">
											<label for="email">Email</label>
											<input type="text" name="email" id="email" />
										</div>
										<div class="field half">
											<label for="pw">Password</label>
											<input type="text" name="password" id="pw" />
										</div>
									</div>
									<ul class="actions">
										<li><input type="submit" value="Register" class="primary" /></li>
										<li><input type="reset" value="Clear" /></li>
									</ul>
								</form>
							</section>
							<section class="split">
								<section>
									<div class="contact-method">
										<span class="icon alt fa-envelope"></span>
										<h3>Email</h3>
										<a href="#">information@untitled.tld</a>
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-phone"></span>
										<h3>Phone</h3>
										<span>(000) 000-0000 x12387</span>
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-home"></span>
										<h3>Address</h3>
										<span>1234 Somewhere Road #5432<br />
										Nashville, TN 00000<br />
										United States of America</span>
									</div>
								</section>
							</section>
						</div>
					</section>

				<!-- Footer -->
					<footer id="footer">
						<div class="inner">
							<ul class="icons">
								<li><a href="#" class="icon alt fa-twitter"><span class="label">Twitter</span></a></li>
								<li><a href="#" class="icon alt fa-facebook"><span class="label">Facebook</span></a></li>
								<li><a href="#" class="icon alt fa-instagram"><span class="label">Instagram</span></a></li>
								<li><a href="#" class="icon alt fa-github"><span class="label">GitHub</span></a></li>
								<li><a href="#" class="icon alt fa-linkedin"><span class="label">LinkedIn</span></a></li>
							</ul>
							<ul class="copyright">
								<li>&copy; Untitled</li><li>Design: <a href="https://html5up.net">HTML5 UP</a></li>
							</ul>
						</div>
					</footer>

			</div>

		<!-- Scripts -->
			<script src="../../public/assets/js/jquery.min.js"></script>
			<script src="../../public/assets/js/jquery.scrolly.min.js"></script>
			<script src="../../public/assets/js/jquery.scrollex.min.js"></script>
			<script src="../../public/assets/js/browser.min.js"></script>
			<script src="../../public/assets/js/breakpoints.min.js"></script>
			<script src="../../public/assets/js/util.js"></script>
			<script src="../../public/assets/js/main.js"></script>
			
			<script>

            for (i = 0; i < posts.length; i++) {
               $("#one.tiles").append( 
                '<article><span class="image"><img src="images/pic01.jpg" alt="" /></span>'	
                +'<header class="major"><h3><a href="'+ posts[i].webUrl + '" class="link">'+posts[i].webTitle+'</a></h3>'
				+'</header></article>');
               
            }
            
            
            </script>

	</body>
</html>