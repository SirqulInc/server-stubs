using FastEndpoints;
using FastEndpoints.Swagger;

var builder = WebApplication.CreateBuilder(args);

builder.Services
    
    .AddFastEndpoints()
    .SwaggerDocument(o =>
    {
        o.DocumentSettings = s =>
        {
            s.DocumentName = "Sirqul IoT Platform";
            s.Title = "Sirqul IoT Platform";
            s.Description = """
Sirqul provides an Engagement-as-a-Service (EaaS)
								  	IoT Platform with Smart Mesh network technology to drive
									  engagement, operational efficiency, rapid innovation and new
								  	revenue streams. Please visit https://dev.sirqul.com/ for more
						  			documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
""";
            s.Version = "3.16";
        };
        o.AutoTagPathSegmentIndex = 0;
    })
    
;

var app = builder.Build();

app
    
    .UseFastEndpoints(x =>
    {
        
    })
    .UseSwaggerGen();

app.UseHttpsRedirection();

app.Run();