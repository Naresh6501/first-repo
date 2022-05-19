import { TestBed } from '@angular/core/testing';

import { loanService } from './loan.service';

describe('EmployeeService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: loanService = TestBed.get(loanService);
    expect(service).toBeTruthy();
  });
});
