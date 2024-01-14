import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ej9Component } from './ej9.component';

describe('Ej9Component', () => {
  let component: Ej9Component;
  let fixture: ComponentFixture<Ej9Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Ej9Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Ej9Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
